# Quarkus Web Template

This repository contains the Backstage Template used to create the Kubernetes resources needed to build/deploy a simple quarkus application.

## Enable Quarkus dev UI

To set properly the Quarkus DevUI, please run the following command in the terminal

```
export DEVUI_URL=$(oc get dw -o=jsonpath='{.items[?(@.status.phase=="Running")].metadata.name}');sed -i 's/<SOMETHING>/'"$DEVUI_URL"'/g' /projects/${WORKSPACE_NAME%%-*}/src/main/resources/application.properties;
```

## Repository Breakdown

TBD
