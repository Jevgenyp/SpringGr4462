package ru.geekbrain.example3sem3hometask.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.geekbrain.example3sem3hometask.domain.User;

@Service
public class RegistrationService {

    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }

    @Autowired
    private DataProcessingService dataProcessingService;

    @Autowired
    private UserService userService;

    @Autowired
    private NotificationService notificationService;

    //Метод processRegistration
    public User processRegistration(String name, int age, String email) {
        User user = userService.createUser(name, age, email); // Создаем пользователя
        dataProcessingService.addUserToList(user); // Добавляем пользователя в репозиторий
        notificationService.notifyUser(user); // Уведомление о создании пользователя
        return user;
    }
}
