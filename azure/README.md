# Current structure of files in project azure directory
```
├── aks
│   └── manifests
│       ├── deployment.yaml
│       ├── ingress.yaml
│       └── service.yaml
├── README.md
└── terraform
    ├── main
    │   ├── main.tf
    │   ├── outputs.tf
    │   └── variables.tf
    ├── main.tf
    ├── terraform.tfstate
    └── terraform.tfstate.backup
```

Here all the all the terraform files are kept under azure/terraform directory

| Files | Description |
| ------ | ------ |
| azure/terraform/main.tf | Is a root module tf file |
| azure/terraform/main/main.tf | Is a main tf file |
| azure/terraform/main/outputs.tf | Is a output tf file |
| azure/terraform/main/variables.tf | Is a variable declation tf file |


# Create Azure resource group, aks cluster using Terraform

cd azure/terraform

| Commands | Operation |
| ------ | ------ |
| terraform init | It downloads the Azure provider that is necessary to translate the Terraform instructions into API calls. It will create two more folders as well as a state file. The state file is used to keep track of the resources that have been created already.|
| terraform plan | Terraform will perform a dry-run and will prompt you with a detailed summary of what resources are about to create |
| teraform apply | Apply to create the resources |
| terraform destroy | Destroy to created resources |