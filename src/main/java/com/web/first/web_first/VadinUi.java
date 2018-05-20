package com.web.first.web_first;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.EntityManager;

@SpringUI()
@Slf4j
public class VadinUi extends UI {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(VadinUi.class);

    private RepositoryEmpolyee repositoryEmpolyee;
    private Employee employee;

    public  TextField imie =new TextField("Imie");


    void dodaj(){
        String pom=imie.getValue();
        employee.setImie(pom);
        log.info(imie.getValue());
        //repositoryEmpolyee.save(new Employee(employee.getImie()));
    }
    @Override
    protected void init(VaadinRequest vaadinRequest) {


        TextField nazwisko= new TextField("nazwisko");
        VerticalLayout components = new VerticalLayout();
        Button wysli= new Button("Wysli");


        components.addComponent(imie);
        components.addComponent(nazwisko);
        components.addComponent(wysli);
        setContent(components);

        wysli.addClickListener(clickEvent ->
                dodaj()
        );


    }
}
