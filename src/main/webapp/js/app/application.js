

angular.module('QcmApp', ['ngRoute']).
    config(['$routeProvider', function ($routeProvider) {
        $routeProvider.
            when('/question', {
                templateUrl: 'views/question/question-list.html',
                controller: 'QuestionListController'
            }).
            when('/newQuestion', {
                templateUrl: 'views/question/question-new.html',
                controller: 'NewQuestionListController'
            }).
            when('/qcm', {
                templateUrl: 'views/qcm/qcm-list.html',
                controller: 'QcmListController'
            }).
            when('/newQcm', {
                templateUrl: 'views/qcm/qcm-new.html',
                controller: 'NewQcmController'
            }).
            otherwise({redirectTo: '/question'});
    }]);