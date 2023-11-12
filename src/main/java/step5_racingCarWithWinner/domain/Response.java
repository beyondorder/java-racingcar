package step5_racingCarWithWinner.domain;

import java.util.ArrayList;
import java.util.List;

public class Response {
    private final List<List<String>>eachStageInfo = new ArrayList<>();
    private final List<Car> carList = new ArrayList<>();


    public void addEachStageInfo(List<String> result){
        eachStageInfo.add(result);
    }

    public void addCarList(List<Car> carList){
        this.carList.addAll(carList);
    }

    public List<Car> carList(){
        return this.carList;
    }

    public List<List<String>> eachStageInfo(){
        return this.eachStageInfo;
    }
}
