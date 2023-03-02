package com.example.date;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDate;
import java.time.format.*;

@RestController
public class MyController {
    @GetMapping("/")
    public String getTime(){
      LocalDate dateObj = LocalDate.now();
      DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
      String formattedDateTime = dateObj.format(format1);
      System.out.println(formattedDateTime);
      //System.out.println(dateObj);
      return formattedDateTime;
    }

    
}
