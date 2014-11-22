angular.module('QcmApp').controller('QuestionListController', function ($rootScope, $scope, $location, QuestionService) {
    $rootScope.activePage = "question"

    function page(o) {
        QuestionService.getQuestions(o, 3).success(function (page) {
            $scope.page = page;
        });
    }

    page(0);

    $scope.previousPage = function () {
        if ($scope.page.offset > 0) {
            page($scope.page.offset - 3);
        }
    };
    $scope.nextPage = function () {
        if ($scope.page.offset < $scope.page.total) {
            page($scope.page.offset + 3);
        }
    };

    $scope.deleteQuestion=function(idListe,idQuestion){
        QuestionService.deleteQuestion(idQuestion).success(function(){
            console.info(idQuestion);
            $scope.page.page.splice(idListe, 1);
            page(0);
         }).error(function() {
            $scope.erreur=true;
        });
    };
});


angular.module('QcmApp').controller('NewQuestionListController', function ($scope, $rootScope, $location, QuestionService) {
    $rootScope.activePage = "question";
    $scope.question = {
        id:1,
        titre: "",
        multiple: true,
        reponses: [
            {titre: '', bonneReponse: ''},
            {titre: '', bonneReponse: ''},
            {titre: '', bonneReponse: ''}
        ]
    };


    $scope.saveQuestion = function () {
        console.info($scope.question)
        QuestionService.saveQuestion($scope.question).success(function () {
            $location.path('/question');
        }).error(function() {
            $scope.erreur=true;
        });
    };

    $scope.saisie = {};

    $scope.addReponse = function () {
        console.info("addReponse");
        $scope.question.reponses.push({});
    };

    $scope.removeReponse = function (contactToRemove) {
        $scope.question.reponses.splice(contactToRemove, 1);
    };
    $scope.nombreReponsesCoches = function () {

        var res = 0;
        for (var i = 0, l = $scope.question.reponses.length; i < l; i++) {

            if ($scope.question.reponses[i].bonneReponse && $scope.question.titre != '' && $scope.question.titre != null && $scope.question.reponses[i].titre != '' && $scope.question.titre != null)
                res++;
        }
        return res;
    };
});


angular.module('QcmApp').controller('QcmListController', function ($rootScope, $scope, $location) {
    $rootScope.activePage = "qcm"


});

angular.module('QcmApp').controller('NewQcmController', function ($rootScope, $scope, $location) {
    $rootScope.activePage = "qcm"


});