package SocialMedia;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Comment comment1 = new Comment("This is a great post!", LocalDate.of(2023, 7, 5));
        Comment comment2 = new Comment("I agree with you.", LocalDate.of(2023, 7, 10));
        Comment comment3 = new Comment("Nice work!", LocalDate.of(2023, 8, 1));
        Comment comment4 = new Comment("Interesting discussion.", LocalDate.of(2023, 8, 15));
        Comment comment5 = new Comment("Keep it up!", LocalDate.of(2023, 9, 2));
        Comment comment6 = new Comment("I have a different perspective.", LocalDate.of(2023, 9, 10));
        Comment comment7 = new Comment("Not sure I agree...", LocalDate.of(2023, 10, 8));
        Comment comment8 = new Comment("Awesome content!", LocalDate.of(2023, 10, 20));
        Comment comment9 = new Comment("Looking forward to more.", LocalDate.of(2023, 11, 5));
        Comment comment10 = new Comment("You've got my support!", LocalDate.of(2023, 11, 15));
        Comment comment11 = new Comment("I learned something new.", LocalDate.of(2023, 12, 1));
        Comment comment12 = new Comment("Can you explain further?", LocalDate.of(2023, 12, 12));
        Comment[] comments1 = {comment1, comment2};
        Comment[] comments2 = {comment3, comment4};
        Comment[] comments3 = {comment5, comment6};
        Comment[] comments4 = {comment7, comment8};
        Comment[] comments5 = {comment9, comment10};
        Comment[] comments6 = {comment11, comment12};
        Post post1 = new Post("postImage1", "Description 1", LocalDate.of(2023, 1, 9), comments1);
        Post post2 = new Post("postImage2", "Description 2", LocalDate.of(2023, 2, 15), comments2);
        Post post3 = new Post("postImage3", "Description 3", LocalDate.of(2023, 3, 20), comments3);
        Post post4 = new Post("postImage4", "Description 4", LocalDate.of(2023, 4, 8), comments4);
        Post post5 = new Post("postImage5", "Description 5", LocalDate.of(2023, 5, 3), comments5);
        Post post6 = new Post("postImage6", "Description 6", LocalDate.of(2023, 6, 27), comments6);
        Post[] posts1 = {post1,post2};
        Post[] posts2 = {post3, post4};
        Post[] posts3 = {post5, post6};
        Post[][] allPosts = {posts1, posts2, posts3};
        Profile profile1 = new Profile("JohnDoe", LocalDate.of(1995, 3, 15), "Male", "Bio 2", posts1);
        Profile profile2 = new Profile("JaneSmith", LocalDate.of(2000, 9, 20), "Female", "Bio 3", posts2);
        Profile profile3 = new Profile("User123", LocalDate.of(1988, 11, 10), "Non-binary", "Bio 4", posts3);

        Profile profiles = new Profile(profile1, profile2, profile3);


        User user1 = new User("john_doe", "john@example.com", 123456, new Profile[]{profile1});
        User user2 = new User("jane_smith", "jane@example.com", 987654, new Profile[]{profile2});
        User user3 = new User("user123", "user@example.com", 567890, new Profile[]{profile3});
        User[] users = {user1, user2, user3};
        DataBase dataBase = new DataBase(users);
     //dataBase.findUserById(1);
   //
    //    dataBase.saveUser(user1);
//            dataBase.updateUserProfile(2,profile1);
//           System.out.println(dataBase.deleteUser(1L));
//          dataBase.saveProfile(1L,profile1);
//         dataBase.findProfileByUserId(1L);
//        dataBase.getPostsByUserId(1L);
//      System.out.println(dataBase.deleteProfileByUserId(1L));
// dataBase.savePost(1,post1);
//            profile1.findCommentByPostId(3L);
//      post1.updateComment(1L,"dfghjkl");
//        user1.searchPost("Description 8");
 user1.deletePostById(2L);
        System.out.println(profile1);
      // dataBase.saveComments(1,comment1);
//post1.deleteComment(comment1);
    //    System.out.println(post1);
    }
}