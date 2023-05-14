package com.alibou.reactive.student;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface StudentRepository extends ReactiveCrudRepository<Student, Long> {

    Flux<Student> findAllByFirstnameContainingIgnoreCase(String firstname);

    //Below for finding students more optimizing way
    Flux<Student> findAllByLastnameContainingIgnoreCase(String firstname);

    Flux<Student> findAllByAge(int age);
}
