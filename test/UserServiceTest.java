import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Test
    void changePassword() {
        UserService service = new UserService();
        assertEquals(true, service.changePassword("userName", "12345678"));
        assertEquals(false, service.changePassword("userName", "123456"));
    }
}