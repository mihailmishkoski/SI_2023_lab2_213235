package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void ValidUserAndEmptyUserList() {
        User user = new User("Random", "!@#$aadsasz$", "randomrandomski@gmail.com");
        List<User> list = new ArrayList<>();
        assertEquals(true,SILab2.function(user,list));
    }
    @Test
    void userEqualsNullTest() {
        // Arrange
        List<User> list = new ArrayList<>();
        User user = null;

        // Act & Assert
        assertThrows(RuntimeException.class, () -> {
            SILab2.function(user, list);
        });
    }
    @Test
    void passwordIsUniqueAndIsShorterThanEight()
    {
        List<User> list = new ArrayList<>();
        list.add(new User("Mihail", "!234567789AZDSAD","mihail123miskoski@gmail.com"));
        User u = new User("Username","!@#!A","username@gmail.com");
        assertEquals(false,SILab2.function(u,list));
    }
    @Test
    void passwordIsNotUniqueAndLongerThanEight()
    {
        List<User> list = new ArrayList<>();
        User user = new User("Samepassword", "samepassword!@#", "usernameusername@gmail.com");
        list.add(new User("Mihail", "!234567789AZDSADsd","mihail123miskoski@gmail.com"));
        assertEquals(false,SILab2.function(user,list));
    }
    @Test
    void passwordIsWithEmptySpace()
    {
        List<User> list = new ArrayList<>();
        User user = new User("Samepassword", "blabla bla!@#Az", "usernameusername@gmail.com");
        list.add(new User("Mihail", "pasw!@#!@#asdasd","mihail123miskoski@gmail.com"));
        assertEquals(false,SILab2.function(user,list));
    }
    @Test
    void passowrdIsWithoutSpecialCharacters()
    {
        List<User> list = new ArrayList<>();
        User user = new User("Samepassword", "blablabla", "usernameusername@gmail.com");
        list.add(new User("Mihail", "pasw!@#!@#asdasd","mihail123miskoski@gmail.com"));
        assertEquals(false,SILab2.function(user,list));
    }
    @Test
    void emailIsNull()
    {
        List<User> list = new ArrayList<>();
        User user = new User("Samepassword", "blablabla", "");
        list.add(new User("Mihail", "pasw!@#!@#asdasd","mihail123miskoski@gmail.com"));
        assertEquals(false,SILab2.function(user,list));
    }
    @Test
    void passwordIsNull() {
        List<User> list = new ArrayList<>();
        User user = new User("Samepassword", "", "usernameusername@gmail.com");
        list.add(new User("Mihail", "pasw!@#!@#asdasd","mihail123miskoski@gmail.com"));
        assertEquals(false, SILab2.function(user, list));
    }
    @Test
    void passowrdAndEmailAreNull() {
        List<User> list = new ArrayList<>();
        User user = new User("Samepassword", "", "");
        list.add(new User("Mihail", "pasw!@#!@#asdasd","mihail123miskoski@gmail.com"));
        assertEquals(false, SILab2.function(user, list));
    }

}