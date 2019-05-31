package io.zipcoder;


public class Music {

    private String[] playList;

    public Music(String[] playList){

        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
       Boolean flag = true;
       Integer closestUp = 0;
       Integer closestDown = 0;
       Integer counter = 0;
       Integer index = startIndex;

       //search up
        while(flag){
            if(playList[index].equals(selection)){
                closestUp = counter;
                break;
            }
            if(index == playList.length){
                index = -1;
            }
            counter++;
            index++;
        }

        //search down
        counter = 0;
        index = startIndex;
        while(flag){
            if(playList[index].equals(selection)){
                closestDown = counter;
                break;
            }
            if(index == 0){
                index = playList.length;
            }
            counter++;
            index--;
        }

        //return the biggest one;
        if(closestDown > closestUp)
            return closestUp;
        else
            return closestDown;
    }
}
