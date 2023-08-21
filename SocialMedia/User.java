package SocialMedia;

public class User {
    private static int id=1;
    private  int exampleId;
private String userName;
private String email;
private int password;
private Profile []profiles;

    public User(String userName, String email, int password, Profile[] profiles) {

        this.userName = userName;
        this.email = email;
        this.password = password;
        this.profiles = profiles;
        this.exampleId=id++;
        profiles.

    }


    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        User.id = id;
    }

    public int getId1() {
        return id1;
    }

    public void setId1(int id1) {
        this.id1 = id1;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }




    public Profile[] getProfiles() {
        return profiles;
    }

    public void setProfiles(Profile profiles) {
        this.profiles = new Profile[]{profiles};
    }

    public void searchPost(String query) {

        for (Profile profile : profiles) {
            for (Post post : profile.getPosts()) {
                if (post.getDescription().contains(query)) {
                    System.out.println(post);
                    break;
                }


            }
        }
    }






    public void deletePostById(Long id) {
        System.out.println("Deleting post with ID: " + id);

        for (Profile profile : profiles) {
            for (Post post : profile.getPosts()) {
                if (post.getId1() == id) {
                    System.out.println("Post found and deleted:");
                    System.out.println(post);
                    post = null;
                    return;
                }
            }
        }

        System.out.println("Post with ID " + id + " not found.");
    }



    @Override
    public String toString() {
        return "User{" +
                "id1=" + id1    +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password=" + password +
                ", profiles=" + profiles +
                '}';
    }
}
