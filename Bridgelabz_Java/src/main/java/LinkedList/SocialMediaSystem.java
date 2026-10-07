import java.util.Scanner;

class FriendNode {
    int friendId;
    FriendNode next;

    FriendNode(int friendId) {
        this.friendId = friendId;
        this.next = null;
    }
}

class UserNode {
    int userId;
    String name;
    int age;

    FriendNode friends;
    UserNode next;

    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;

        this.friends = null;
        this.next = null;
    }
}

class SocialMedia {

    UserNode head;

    // Find a user by ID
    UserNode findUser(int userId) {

        UserNode temp = head;

        while (temp != null) {

            if (temp.userId == userId) {
                return temp;
            }

            temp = temp.next;
        }

        return null;
    }

    // Add a new user
    void addUser(int userId, String name, int age) {

        UserNode newUser =
                new UserNode(userId, name, age);

        if (head == null) {
            head = newUser;
            return;
        }

        UserNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newUser;
    }

    // Check whether two users are already friends
    boolean areFriends(UserNode user, int friendId) {

        FriendNode temp = user.friends;

        while (temp != null) {

            if (temp.friendId == friendId) {
                return true;
            }

            temp = temp.next;
        }

        return false;
    }

    // Add friend ID to a user's friend list
    void addFriendToList(UserNode user, int friendId) {

        FriendNode newFriend =
                new FriendNode(friendId);

        if (user.friends == null) {
            user.friends = newFriend;
            return;
        }

        FriendNode temp = user.friends;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newFriend;
    }

    // 1. Add friend connection
    void addFriend(int userId1, int userId2) {

        UserNode user1 = findUser(userId1);
        UserNode user2 = findUser(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        if (userId1 == userId2) {
            System.out.println("A user cannot be their own friend.");
            return;
        }

        if (areFriends(user1, userId2)) {
            System.out.println("Already friends.");
            return;
        }

        // Friendship is mutual
        addFriendToList(user1, userId2);
        addFriendToList(user2, userId1);

        System.out.println("Friend connection added.");
    }

    // Remove a friend ID from a user's friend list
    void removeFriendFromList(UserNode user, int friendId) {

        if (user.friends == null) {
            return;
        }

        // Friend is first node
        if (user.friends.friendId == friendId) {
            user.friends = user.friends.next;
            return;
        }

        FriendNode temp = user.friends;

        while (temp.next != null &&
               temp.next.friendId != friendId) {

            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // 2. Remove friend connection
    void removeFriend(int userId1, int userId2) {

        UserNode user1 = findUser(userId1);
        UserNode user2 = findUser(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        if (!areFriends(user1, userId2)) {
            System.out.println("They are not friends.");
            return;
        }

        // Remove from both users
        removeFriendFromList(user1, userId2);
        removeFriendFromList(user2, userId1);

        System.out.println("Friend connection removed.");
    }

    // 3. Find mutual friends
    void findMutualFriends(int userId1, int userId2) {

        UserNode user1 = findUser(userId1);
        UserNode user2 = findUser(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        boolean found = false;

        FriendNode temp1 = user1.friends;

        System.out.println("Mutual Friends:");

        while (temp1 != null) {

            FriendNode temp2 = user2.friends;

            while (temp2 != null) {

                if (temp1.friendId == temp2.friendId) {

                    UserNode mutualUser =
                            findUser(temp1.friendId);

                    if (mutualUser != null) {
                        System.out.println(
                                mutualUser.name +
                                " (ID: " +
                                mutualUser.userId +
                                ")"
                        );
                    }

                    found = true;
                    break;
                }

                temp2 = temp2.next;
            }

            temp1 = temp1.next;
        }

        if (!found) {
            System.out.println("No mutual friends.");
        }
    }

    // 4. Display all friends
    void displayFriends(int userId) {

        UserNode user = findUser(userId);

        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println(
                "\nFriends of " + user.name + ":"
        );

        if (user.friends == null) {
            System.out.println("No friends.");
            return;
        }

        FriendNode temp = user.friends;

        while (temp != null) {

            UserNode friend =
                    findUser(temp.friendId);

            if (friend != null) {

                System.out.println(
                        "ID: " + friend.userId +
                        ", Name: " + friend.name +
                        ", Age: " + friend.age
                );
            }

            temp = temp.next;
        }
    }

    // 5. Search by User ID
    void searchById(int userId) {

        UserNode user = findUser(userId);

        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        displayUser(user);
    }

    // Search by name
    void searchByName(String name) {

        UserNode temp = head;
        boolean found = false;

        while (temp != null) {

            if (temp.name.equalsIgnoreCase(name)) {
                displayUser(temp);
                found = true;
            }

            temp = temp.next;
        }

        if (!found) {
            System.out.println("User not found.");
        }
    }

    // Display user
    void displayUser(UserNode user) {

        System.out.println("----------------------");
        System.out.println("User ID : " + user.userId);
        System.out.println("Name    : " + user.name);
        System.out.println("Age     : " + user.age);
    }

    // 6. Count friends for each user
    void countFriends() {

        UserNode user = head;

        while (user != null) {

            int count = 0;

            FriendNode temp = user.friends;

            while (temp != null) {
                count++;
                temp = temp.next;
            }

            System.out.println(
                    user.name +
                    " (ID: " + user.userId +
                    ") has " +
                    count +
                    " friend(s)."
            );

            user = user.next;
        }
    }

    // Display all users
    void displayUsers() {

        UserNode temp = head;

        while (temp != null) {
            displayUser(temp);
            temp = temp.next;
        }
    }
}

public class SocialMediaSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SocialMedia socialMedia =
                new SocialMedia();

        while (true) {

            System.out.println("\n===== SOCIAL MEDIA =====");
            System.out.println("1. Add User");
            System.out.println("2. Add Friend Connection");
            System.out.println("3. Remove Friend Connection");
            System.out.println("4. Find Mutual Friends");
            System.out.println("5. Display Friends");
            System.out.println("6. Search User by ID");
            System.out.println("7. Search User by Name");
            System.out.println("8. Count Friends");
            System.out.println("9. Display All Users");
            System.out.println("10. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter User ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    socialMedia.addUser(id, name, age);

                    break;

                case 2:

                    System.out.print("Enter first User ID: ");
                    int id1 = sc.nextInt();

                    System.out.print("Enter second User ID: ");
                    int id2 = sc.nextInt();

                    socialMedia.addFriend(id1, id2);

                    break;

                case 3:

                    System.out.print("Enter first User ID: ");
                    id1 = sc.nextInt();

                    System.out.print("Enter second User ID: ");
                    id2 = sc.nextInt();

                    socialMedia.removeFriend(id1, id2);

                    break;

                case 4:

                    System.out.print("Enter first User ID: ");
                    id1 = sc.nextInt();

                    System.out.print("Enter second User ID: ");
                    id2 = sc.nextInt();

                    socialMedia.findMutualFriends(id1, id2);

                    break;

                case 5:

                    System.out.print("Enter User ID: ");
                    id = sc.nextInt();

                    socialMedia.displayFriends(id);

                    break;

                case 6:

                    System.out.print("Enter User ID: ");
                    id = sc.nextInt();

                    socialMedia.searchById(id);

                    break;

                case 7:

                    System.out.print("Enter Name: ");
                    name = sc.nextLine();

                    socialMedia.searchByName(name);

                    break;

                case 8:

                    socialMedia.countFriends();

                    break;

                case 9:

                    socialMedia.displayUsers();

                    break;

                case 10:

                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid choice.");
            }
        }
    }
}