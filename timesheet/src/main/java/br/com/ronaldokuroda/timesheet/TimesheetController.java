package br.com.ronaldokuroda.timesheet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimesheetController {

    @Autowired
    private TimesheetRepository repositorio;

    @GetMapping("/timesheet")
    public List<Timesheet> obtertTimesheets(){
        List<Timesheet> timesheet = repositorio.findAll();
        return timesheet;
    }
    
}
