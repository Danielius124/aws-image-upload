package com.danielius.awsimageupload.datastore;

import com.danielius.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class FakeUserProfileDataStore {

    private  static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("93b65f14-0736-4abe-b7e0-be7eb7a03f2c"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("cfb84006-b62c-414b-af49-6d3e50a43d1a"), "antoniojunior", null));
    }

    public  List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
