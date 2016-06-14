package com.digdes.scrum;

import com.vaadin.addon.charts.Chart;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;
import org.vaadin.spring.annotation.VaadinUI;

@VaadinUI
public class VaadinTest extends UI {
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setContent(new Chart());
    }
}