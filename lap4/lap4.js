function bai1($scope){
    $scope.ten = "Nguyễn văn Tèo";
    $scope.ngaysinh = "20-01-1995";
    $scope.gioitinh = "Nam";
    $scope.photo = "anh5.jpg";
    $scope.diemTB = "8.5";
}
var app = angular.module("myapp",[]);
app.controller("bai1Controller",bai1);
app.controller("bai2Controller",function($scope){
    $scope.student = {
        "ten" : "thinh",
        "ngaysinh" : "13/03/2003",
        "gioitinh" : "Nam",
        "photo" : "anh5.jpg",
        "diemTB" : "5.0"
    };
});
app.controller("bai3Controller",function($scope){
    $scope.students = [{
        "photo" : "anh5.jpg",
        "ten" : "thinh",
        "ngaysinh" : "13/03/2003",
        "gioitinh" : "Nam",
        "photo" : "anh5.jpg",
        "diemTB" : "5.0"
    },{
        "photo" : "anh5.jpg",
        "ten" : "thinh",
        "ngaysinh" : "13/03/2003",
        "gioitinh" : "Nam",
        "photo" : "anh5.jpg",
        "diemTB" : "6.0"
    },{
        "photo" : "anh5.jpg",
        "ten" : "thinh",
        "ngaysinh" : "13/03/2003",
        "gioitinh" : "Nam",
        "photo" : "anh5.jpg",
        "diemTB" : "7.0"
    }];
});