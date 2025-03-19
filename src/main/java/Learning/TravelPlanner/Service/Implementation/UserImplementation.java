package Learning.TravelPlanner.Service.Implementation;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import Learning.TravelPlanner.Entity.User;
import Learning.TravelPlanner.Service.UserService;
import jakarta.annotation.PostConstruct;

@Service
public class UserImplementation implements UserService {

    private final User localUser;

//     The dependencies of some of the beans in the application context form a cycle:

//    ticketController defined in file 
// ┌─────┐
// |  ticketImplementation defined in file 
// ↑     ↓
// |  userImplementation defined in file 
// └─────┘
    private final TicketImplementation ticketImplementation;
    public UserImplementation(User user, TicketImplementation ticketImplementation) {
        this.localUser = user;
        this.ticketImplementation = ticketImplementation;
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

    // 2. Method to resolve circular dependencies is using postconstruct which can help resolve circular dependencies
    // @PostConstruct
    // public void initialize(){
    //     ticketImplementation.setUserImplementation(this);
    //     System.out.println("Bean has been constructed and dependency have been injected.");
    // }

    @Override
    public User getUser() {
        return this.localUser;
    }
}
