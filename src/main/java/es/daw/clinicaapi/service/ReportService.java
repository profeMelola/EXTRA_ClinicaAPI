package es.daw.clinicaapi.service;


import es.daw.clinicaapi.dto.report.TopServiceReport;
import es.daw.clinicaapi.enums.InvoiceStatus;
import es.daw.clinicaapi.exception.BadRequestException;
import lombok.RequiredArgsConstructor;
import org.springframework.cglib.core.Local;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReportService {

    public List<TopServiceReport> getTopServices(LocalDateTime from,
                                                 LocalDateTime to,
                                                 InvoiceStatus status,
                                                 Pageable pageable) {

        // Mejora: el rango que se pueda configurar en daw.properties
        if (from.isBefore(LocalDateTime.now()) && to.isAfter(LocalDateTime.now())) {
            if (pageable.getPageSize() < 1 || pageable.getPageSize() > 5)
                throw new BadRequestException("El tamaño de página debe estar entre 1 y 5");
        }
        throw new BadRequestException("mal las fechas el to debe posterior al from !!!!!");

    }

}
