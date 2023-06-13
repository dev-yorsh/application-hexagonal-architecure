package com.legall.inspeccion.application.service.administracion.marca;

import com.legall.inspeccion.application.ports.input.administracion.marca.MarcaFilterUseCase;
import com.legall.inspeccion.application.ports.input.administracion.marca.MarcaFindAllUseCase;
import com.legall.inspeccion.application.ports.input.administracion.marca.MarcaFindByIdUseCase;
import com.legall.inspeccion.application.ports.input.administracion.marca.MarcaSaveUseCase;
import com.legall.inspeccion.application.ports.input.administracion.marca.exception.MarcaUseCaseException;
import com.legall.inspeccion.application.ports.output.administracion.marca.MarcaFindAllPort;
import com.legall.inspeccion.application.ports.output.administracion.marca.MarcaFindByIdPort;
import com.legall.inspeccion.application.ports.output.administracion.marca.MarcaFindByNamePort;
import com.legall.inspeccion.application.ports.output.administracion.marca.MarcaSavePort;
import com.legall.inspeccion.domain.administracion.Marca;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import static com.legall.inspeccion.application.service.constants.MensajeConstanteApplication.MarcaMessageConstant.MARCA_NOMBRE_INVALIDO;
import static com.legall.inspeccion.application.service.constants.MensajeConstanteApplication.MarcaMessageConstant.MARCA_NO_ENCONTRADA;

public class MarcaService implements MarcaFilterUseCase, MarcaFindAllUseCase,
        MarcaFindByIdUseCase, MarcaSaveUseCase {

    private final MarcaFindByNamePort marcaFindByNamePort;
    private final MarcaSavePort marcaSavePort;
    private final MarcaFindAllPort marcaFindAllPort;
    private final MarcaFindByIdPort marcaFindByIdPort;

    public MarcaService(MarcaFindByNamePort marcaFindByNamePort, MarcaSavePort marcaSavePort,
                        MarcaFindAllPort marcaFindAllPort, MarcaFindByIdPort marcaFindByIdPort) {
        this.marcaFindByNamePort = marcaFindByNamePort;
        this.marcaSavePort = marcaSavePort;
        this.marcaFindAllPort = marcaFindAllPort;
        this.marcaFindByIdPort = marcaFindByIdPort;
    }

    @Override
    public List<Marca> findAllAndFilter(List<Marca> listaMarcas, Predicate<Marca> predicate)
            throws MarcaUseCaseException {

        try {
            return marcaFindAllPort.findAll().stream().filter(predicate).toList();
        } catch (Exception e) {
            throw new MarcaUseCaseException(e);
        }
    }

    @Override
    public Marca save(Marca marca) throws MarcaUseCaseException {
        this.validarNombreValido(marca.getNombre());
        this.validarSiExisteMarca(marca);
        return this.marcaSavePort.save(marca);
    }

    @Override
    public List<Marca> findAll() throws MarcaUseCaseException {
        try {
            return marcaFindAllPort.findAll();
        } catch (Exception e) {
            throw new MarcaUseCaseException(e);
        }
    }

    @Override
    public Marca findById(Long id) throws MarcaUseCaseException {
        Optional<Marca> marcaOptional = marcaFindByIdPort.marcaFindById(id);
        return marcaOptional.orElseThrow(() ->
                new MarcaUseCaseException(MARCA_NO_ENCONTRADA));
    }

    private void validarSiExisteMarca(Marca marca) throws MarcaUseCaseException {
        Optional<Marca> marcaOptional = marcaFindByNamePort.findByName(marca.getNombre());
        if (marcaOptional.isPresent()) {
            throw new MarcaUseCaseException("La marca " + marca.getNombre() + " ya existe");
        }
    }

    private void validarNombreValido(String marca) {
        if (Marca.nameIsInvalid(marca)) {
            throw new MarcaUseCaseException(MARCA_NOMBRE_INVALIDO);
        }
    }


}
