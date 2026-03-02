package es.daw.clinicaapi.controller;

import es.daw.clinicaapi.dto.report.TopServiceReport;
import es.daw.clinicaapi.enums.InvoiceStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/reports")
@RequiredArgsConstructor
public class ReportController {


    @GetMapping("/top-services")
    @PreAuthorize("hasRole('BILLING')")
    public ResponseEntity<List<TopServiceReport>> topServices(
            @RequestParam LocalDateTime from,
            @RequestParam LocalDateTime to,
            @RequestParam(required = false)InvoiceStatus status,
            @PageableDefault(page=0, size = 3) Pageable pageable
            ) {


        return null;
    }
}


