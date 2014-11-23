

angular.module('QcmApp').factory('QuestionService', function ($http) {
    return {
        getQuestions: function (offset, count) {
            return $http({method: 'get', url:'rest/questions', params:{'offset': offset, 'count': count}});
        },
        save: function (newQuestion) {
            return $http.post('rest/questions/add', newQuestion);
        },
        delete: function (idQuestion) {
            return $http({method: 'get', url:'rest/questions/delete', params:{'idQuestion': idQuestion}});
        }
    }
});
