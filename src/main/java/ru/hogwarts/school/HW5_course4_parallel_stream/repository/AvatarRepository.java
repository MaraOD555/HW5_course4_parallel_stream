package ru.hogwarts.school.HW5_course4_parallel_stream.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hogwarts.school.HW5_course4_parallel_stream.model.Avatar;

import java.util.Optional;

public interface AvatarRepository extends JpaRepository<Avatar, Long> { //расширяет PagingAndSortingRepository
     Optional<Avatar> findAvatarByStudentId (long studentId);
}
