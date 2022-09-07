package br.com.ronaldokuroda.timesheet;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TimesheetRepository extends MongoRepository<Timesheet, String>{
    
}