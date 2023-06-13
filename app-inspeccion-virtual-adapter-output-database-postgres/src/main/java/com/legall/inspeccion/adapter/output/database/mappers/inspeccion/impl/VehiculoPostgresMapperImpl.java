package com.legall.inspeccion.adapter.output.database.mappers.inspeccion.impl;

import com.legall.inspeccion.adapter.output.database.entity.inspeccion.VehiculoEntityPostgres;
import com.legall.inspeccion.adapter.output.database.entity.inspeccion.builder.VehiculoEntityBuilder;
import com.legall.inspeccion.adapter.output.database.mappers.inspeccion.VehiculoMapper;
import com.legall.inspeccion.domain.inspeccion.Vehiculo;
import com.legall.inspeccion.domain.inspeccion.builder.VehiculoBuilder;
import org.springframework.stereotype.Component;

import static com.legall.inspeccion.adapter.output.database.constants.MessageConstants.ErrorConstants.MAPPER_ERROR;
import static com.legall.inspeccion.domain.base.utilenum.EnumValue.estadoEnumValue;
import static java.util.Objects.isNull;

@Component
public class VehiculoPostgresMapperImpl implements VehiculoMapper {

    @Override
    public VehiculoEntityPostgres toEntity(Vehiculo dto) {
        this.validarObjeto(dto);
        return new VehiculoEntityBuilder()
                .id(dto.getId())
                .marcaId(dto.getMarcaId())
                .placa(dto.getPlaca())
                .modelo(dto.getModelo())
                .anio(dto.getAnio())
                .color(dto.getColor())
                .numeroMotor(dto.getNumeroMotor())
                .vin(dto.getVin())
                .numeroCilindro(dto.getNumeroCilindros())
                .numeroPuerta(dto.getNumeroPuertas())
                .kilometraje(dto.getKilometraje())
                .presentaDanios(dto.getPresentaDanios())
                .detalleDanios(dto.getDetalleDanios())
                .observacion(dto.getObservaciones())
                .estado(dto.getEstado().getId())
                .build();
    }

    @Override
    public Vehiculo toDomain(VehiculoEntityPostgres entity) {
        this.validarObjeto(entity);
        return new VehiculoBuilder()
                .id(entity.getVehiculoId())
                .marcaId(entity.getMarcaId())
                .placa(entity.getPlaca())
                .modelo(entity.getModelo())
                .anio(entity.getAnio())
                .color(entity.getColor())
                .numeroMotor(entity.getNumeroMotor())
                .vin(entity.getVin())
                .numeroCilindro(entity.getNumeroCilindro())
                .numeroPuerta(entity.getNumeroPuerta())
                .kilometraje(entity.getKilometraje())
                .presentaDanios(entity.getPresentaDanios())
                .detalleDanios(entity.getDetalleDanios())
                .observacion(entity.getObservacion())
                .estado(estadoEnumValue(entity.getEstado()))
                .build();
    }

    private void validarObjeto(Object marca) {
        if (isNull(marca))
            throw new NullPointerException(MAPPER_ERROR);
    }

}
