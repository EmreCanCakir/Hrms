package kodlamaio.northwind.api.controllers;

import kodlamaio.northwind.business.abstracts.JobPositionsService;
import kodlamaio.northwind.entities.concretes.JobPositions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController   // Bu class'in controller oldugunu springe belirttik.
@RequestMapping ("/api/job-positions")  // Dis dunyadan "/api/JobPositions" diye bi istek gelirse bu class calisacak.
public class JobPositionsController {

    private JobPositionsService jobPositionsService;

    @Autowired
    public JobPositionsController(JobPositionsService jobPositionsService) {
        this.jobPositionsService = jobPositionsService;
    }
    @GetMapping("/getall")
    public List<JobPositions> getAll() {
        return this.jobPositionsService.getAll();
    }

}
