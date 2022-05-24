package com.codeClan.example.files_folder_hw.repository;

import com.codeClan.example.files_folder_hw.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
