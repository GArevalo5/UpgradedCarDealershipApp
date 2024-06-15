package com.pluralsight;

import com.pluralsight.application.ApplicationConfiguration;
import com.pluralsight.application.CarDealershipApp;

public class Main {
public static void main(String[] args){
    ApplicationConfiguration config = new ApplicationConfiguration();
    CarDealershipApp app = new CarDealershipApp(config);

    app.run();

}
}