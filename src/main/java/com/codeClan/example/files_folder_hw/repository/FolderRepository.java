package com.codeClan.example.files_folder_hw.repository;

import com.codeClan.example.files_folder_hw.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
