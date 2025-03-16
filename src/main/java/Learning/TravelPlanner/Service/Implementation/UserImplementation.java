package Learning.TravelPlanner.Service.Implementation;

import org.springframework.stereotype.Service;

import Learning.TravelPlanner.Entity.User;
import Learning.TravelPlanner.Service.UserService;

@Service
public class UserImplementation implements UserService {

    private final User localUser;
    public UserImplementation(User user) {
        this.localUser = user;
    }

    @Override
    public boolean updateUser(User user) {
        if(user == null){
            return false;
        }
        // Implement logic to update user in the database
        if(user.getFirstName() != null){
            this.localUser.setFirstName(user.getFirstName());
        }
        if(user.getLastName()!= null){
            this.localUser.setLastName(user.getLastName());
        }
        if(user.getEmail()!= null){
            this.localUser.setEmail(user.getEmail());
        }
        if(user.getDateOfBirth() != null){
            this.localUser.setPassword(user.getPassword());
        }
        return true;
    }

    @Override
    public User getUser() {
        return this.localUser;
    }
}
