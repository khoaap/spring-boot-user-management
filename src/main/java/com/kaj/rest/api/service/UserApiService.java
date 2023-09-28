package com.kaj.rest.api.service;

import com.kaj.rest.api.model.User;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

public interface UserApiService {
    ResponseEntity<?> getAllUsers();

    ResponseEntity<?> getUsersPaginated(int page);

    ResponseEntity<?> getUserById(Long id);

    ResponseEntity<?> addUser(User user);

    ResponseEntity<?> updateUser(Long id, User user);

    ResponseEntity<?> deleteUser(Long id);
}
