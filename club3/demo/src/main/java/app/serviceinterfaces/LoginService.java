package app.serviceinterfaces;

import app.dto.UserDto;

public interface LoginService {
    public void login(UserDto userDto) throws Exception;
    public void logout();

    
}