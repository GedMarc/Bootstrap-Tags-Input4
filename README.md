# JWebMP-Bootstrap-Tags-Input
Use the Bootstrap Tags Input directly through JWebMP

Example for simple tags input : 
```
BootstrapTagsInput bs = new BootstrapTagsInput();
bs.getOptions().setFreeInput(true);
```

Example for look ahead values : 
```
BootstrapTagsInput bs = new BootstrapTagsInput();
bs.getOptions().setMaxTags(8);
bs.getOptions().getTypeAhead().getSource().add("New Lookahead Value");
```

As a feature on any component :
```
BootstrapTagsInputFeature bsf = new BootstrapTagsInputFeature(getInstance().getBody());
bsf.getOptions().setItemText("New Value");
```

# Bootstrap Tags Input

jQuery plugin providing a Twitter Bootstrap user interface for managing tags

Bootstrap Link
https://bootstrap-tagsinput.github.io/bootstrap-tagsinput/examples/


### Teamcity (https://jwebmp.com/teamcity/viewType.html?buildTypeId=JWebSwingPlugins_BuildBootstrapTags)
### Jira (https://jwebmp/jira/secure/RapidBoard.jspa?rapidView=1&projectKey=JWEB&view=planning.nodetail&epics=visible&selectedEpic=JWEB-201)
### SonarQube (https://jwebmp.com/sonar/dashboard?id=com.jwebmp%3Ajwebmp-bootstrap-tags-input&did=1)
### Plugin Source (https://bootstrap-tagsinput.github.io/bootstrap-tagsinput/examples/)

### Built in collobaration with 
![alt BrowserStack](https://bstacksupport.zendesk.com/attachments/token/ZbwSzMlt8HaSgOBgmGVHtpTNV/?name=Logo-01.svg)
