package com.thoughtworks.inprocess.webdriver;

import com.thoughtworks.inprocess.jetty.HttpAppTester;
import com.thoughtworks.inprocess.htmlunit.InProcessWebConnection;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class InProcessHtmlUnitDriver extends HtmlUnitDriver {


    public InProcessHtmlUnitDriver(HttpAppTester httpAppTester) {
        getWebClient().setWebConnection(new InProcessWebConnection(getWebClient(), httpAppTester));
    }

}