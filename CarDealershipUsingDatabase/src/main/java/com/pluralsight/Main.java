package com.pluralsight;

import com.pluralsight.application.ApplicationConfiguration;
import com.pluralsight.application.carDealershipApp;

public class Main {
public static void main(String[] args){
    ApplicationConfiguration config = new ApplicationConfiguration();

    carDealershipApp app = new carDealershipApp(config);
    app.run();
}
}