

angular.module('QcmApp').factory('QuestionService', function ($http) {
    return {
        getQuestions: function (offset, count) {
            return $http({method: 'get', url:'rest/questions', params:{'offset': offset, 'count': count}});
        },
        saveQuestion: function (newQuestion) {
            return $http.post('rest/questions/add', newQuestion);
        },
        deleteQuestion: function (idQuestion) {
            return $http({method: 'get', url:'rest/questions/delete', params:{'idQuestion': idQuestion}});
        }
    }
});
