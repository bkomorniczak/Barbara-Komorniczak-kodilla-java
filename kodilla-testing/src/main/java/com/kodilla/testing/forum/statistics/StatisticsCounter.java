package com.kodilla.testing.forum.statistics;

public class StatisticsCounter {
    private int usersNumber;
    private int postsNumber;
    private int commentsNumber;
    private double avrPostNumbPerUser;
    private double avrCommentNumbPerUser;
    private double avrCommentNumbPerPost;

    public double getAvrPostNumbPerUser() {
        return avrPostNumbPerUser;
    }

    public double getAvrCommentNumbPerUser() {
        return avrCommentNumbPerUser;
    }

    public double getAvrCommentNumbPerPost() {
        return avrCommentNumbPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics){
        usersNumber = statistics.userNames().size();
        if(usersNumber==0){
            System.out.println("There are no users, there no posts, there is nothing.");

        }else {
            postsNumber = statistics.postsCount();
            commentsNumber = statistics.commentsCount();
            avrPostNumbPerUser = (double) postsNumber / usersNumber;
            avrCommentNumbPerUser = (double)commentsNumber / usersNumber;
            if (postsNumber > 0) {
                avrCommentNumbPerPost = (double)commentsNumber / postsNumber;
            } else {
                System.out.println("Brak postów");
            }
        }



    }

    public void showStatistics(){
        System.out.println("Number of users:" + usersNumber +
                           "Number of posts" + postsNumber +
                           "Number of comments" + commentsNumber +
                           "Average of posts per user" + avrPostNumbPerUser +
                           "Average of comments per user" + avrCommentNumbPerUser +
                           "Average of comments per post" + avrCommentNumbPerPost);
    }
}