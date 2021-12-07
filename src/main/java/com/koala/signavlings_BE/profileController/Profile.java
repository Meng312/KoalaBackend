/**
 * The Profile class contains the declaration of user profile attributes
 *
 * @author Preeti Thorat, Luise Loparev
 */

package com.koala.signavlings_BE.profileController;


//import org.springframework.data.annotation.Id;
import javax.persistence.*;


@Entity
//@Table(name = "Profile")
public class Profile {

    @Id
    private Long id;

    private String name;

    private String joiningMonth;

    private String location;

    private String bio;

    private String role;

    private String photo;


/**
 *     "profileId": 20,
 *     "name": "John Doe",
 *     "email": null,
 *     "location": "Hamburg",
 *     "join date": "September 2021",
 *     "bio" : "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.",
 *     "role": "Senior BE",
 *     "team": null,
 *     "photo": "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcReBoB3uhPYwy6Vtp1PelM5Zyf8Ov5U98DANA&usqp=CAU"
*/
    public Profile(
            Long id,
            String name,
            String joiningMonth,
            String location,
            String bio,
            String role,
            String photo
    ) {
        this.id = id;
        this.name = name;
        this.joiningMonth = joiningMonth;
        this.location = location;
        this.bio = bio;
        this.role = role;
        this.photo = photo;
    }


    public Profile(){

    }

    public Profile updateWith(Profile profile) {
        return new Profile(
                this.id,
                profile.name,
                profile.joiningMonth,
                profile.location,
                profile.bio,
                profile.role,
                profile.photo
        );
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getJoiningMonth() {
        return joiningMonth;
    }

    public void setJoiningMonth(String joiningMonth) {
        this.joiningMonth = joiningMonth;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
