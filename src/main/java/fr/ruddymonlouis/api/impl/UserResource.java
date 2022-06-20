package fr.ruddymonlouis.api.impl;

import fr.ruddymonlouis.TemporaryData;
import fr.ruddymonlouis.api.UsersApi;
import fr.ruddymonlouis.domain.User;
import fr.ruddymonlouis.api.model.UserRes;
import fr.ruddymonlouis.exceptions.UnknownResourceException;
import fr.ruddymonlouis.util.Utility;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Component("UserApi")
public class UserResource implements UsersApi {

    @Override
    public Response createUser(UserRes userRes) {
        User user = Utility.toDomain(userRes);
        TemporaryData.users.add(user);
        return Response.ok(Utility.toResource(user))
                .status(Response.Status.CREATED)
                .build();
    }

    @Override
    public Response getAllUsers(LocalDate startDate, LocalDate endDate) {
                List<UserRes> userRes = TemporaryData.users.stream()
                .map(Utility::toResource)
                .collect(Collectors.toList());
        return Response.ok(new GenericEntity<>(userRes) {}).build();
    }


//    @Override
//    public Response getAllUsers() {
//        List<UserRes> userRes = TemporaryData.users.stream()
//                .map(Utility::toResource)
//                .collect(Collectors.toList());
//        return Response.ok(new GenericEntity<>(userRes) {}).build();
//    }

    @Override
    public Response getUserById(UUID userId) {
        try {
            Optional<UserRes> userRes = TemporaryData.users.stream()
                    .filter(u -> u.getId().equals(userId))
                    .map(Utility::toResource).findFirst();
            if (userRes.isEmpty()) {
                throw new UnknownResourceException();
            }
        } catch (Exception e) {

        }

        return null;
    }

}
