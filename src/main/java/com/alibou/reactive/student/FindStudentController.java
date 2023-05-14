package com.alibou.reactive.student;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("api/v1/student/find/")
@RequiredArgsConstructor
public class FindStudentController {

    private final StudentService service;

    // Below methods for finding students
    @GetMapping("/{firstname}")
    public ResponseEntity<Flux<Student>> getByFirstName(@PathVariable String firstname) {
        return ResponseEntity
                .ok(
                        service
                                .findByFirstname(firstname)
                );
    }

    @GetMapping("/{lastname}")
    public ResponseEntity<Flux<Student>> getByLastName(@PathVariable String lastname) {
        return ResponseEntity
                .ok(
                        service
                                .findByLastname(lastname)
                );
    }

    @GetMapping("/{age}")
    public ResponseEntity<Flux<Student>> getByAge(@PathVariable int age) {
        return ResponseEntity
                .ok(
                        service
                                .findByAge(age)
                );
    }


}
