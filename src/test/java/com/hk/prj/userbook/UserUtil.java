package com.hk.prj.userbook;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import com.hk.prj.userbook.domain.User;

import java.util.Arrays;
import java.util.List;

public class UserUtil {
    public static List<User> getUsers() {
        User user1 = User.builder().firstName("H1").lastName("K1").city("Delhi").email("h@hk.com").country("IND").build();
        User user2 = User.builder().firstName("H2").lastName("K2").city("Mumbai").email("h2@hk.com").country("IND").build();
        User user3 = User.builder().firstName("H3").lastName("K3").city("Hyderabad").email("h3@hk.com").country("IND").build();
        return Arrays.asList(user1, user2, user3);
    }

    public static Page<User> getUsersPage() {
        return new PageImpl<>(getUsers());
    }
}
