package edu.isu.cs.cs2263.hw02;

import com.google.common.collect.Maps;
import edu.isu.cs.cs2263.hw02.data.Course;
import edu.isu.cs.cs2263.hw02.views.AppView;
import edu.isu.cs.cs2263.hw02.views.CoursesFormView;
import edu.isu.cs.cs2263.hw02.views.DisplayListView;
import edu.isu.cs.cs2263.hw02.views.WelcomeView;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.BorderPane;
import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.testfx.api.FxAssert;
import org.testfx.api.FxAssertContext;
import org.testfx.framework.junit.ApplicationTest;
import org.testfx.matcher.control.ButtonMatchers;

import java.util.Map;
import java.util.Vector;

public class AppTest extends ApplicationTest {
    private Vector<Course> courses;
    private AppView currentView;
    private Map<String, AppView> views;
    private BorderPane mainLayout;
    private ChoiceBox<String> depts;
    private Scene scene;


    public AppTest(){
    }

    @Test
    public void displayButtonTextTest(){

    }

    @Test
    public void startTest(){
    }
}
