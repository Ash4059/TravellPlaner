package Learning.TravelPlanner.Service;

import Learning.TravelPlanner.Entity.User;

public interface UserService {
    boolean updateUser(User user);
    User getUser();
}
