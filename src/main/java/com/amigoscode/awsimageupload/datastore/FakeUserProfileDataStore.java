package com.amigoscode.awsimageupload.datastore;

import com.amigoscode.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("8ae1e482-fab5-4c7c-ab27-83edd41963f1"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("1d6c55e7-5129-4adc-ade4-d6e77de98403"), "antoniojunior", null));

    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }



}
