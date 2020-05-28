package org.pk.siwz.simpleauth.data.model;

import javax.persistence.*;

@Entity
public class Application {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String appId;
    private String name;
    private String redirectUrl;

    public Application(String appId) {
        this.appId = appId;
    }

}
