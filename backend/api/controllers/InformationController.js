/**
 * InformationController
 *
 * @description :: Server-side logic for managing Information
 * @help        :: See http://sailsjs.org/#!/documentation/concepts/Controllers
 */

module.exports = {
	createInfo: function(req,res){
        var superpass = req.query.superpass;
        if(superpass === 'Bienquisto123H'){
            var {category,title,content,url} = req.body;
            InfoService.createInfo(category,title,content,url,function(status){
                res.send(status);
            })
        }
        else return res.badRequest();
    },
    getAllInfoCategory: function(req,res){
        var category = req.query.category;
        InfoService.getAllInfoCategory(category,function(status){
            res.send(status);
        })
    },
};

