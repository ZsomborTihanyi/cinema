package hu.elte.cinemabooking.security;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import hu.elte.cinemabooking.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@RequestScope
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticatedUser {
    private User user;
}
