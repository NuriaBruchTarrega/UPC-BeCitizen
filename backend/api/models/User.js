  /**
 * User.js
 *
 * @description :: TODO: You might write a short summary of how this model works and what it represents here.
 * @docs        :: http://sailsjs.org/documentation/concepts/models-and-orm/models
 */

module.exports = {

  attributes: {
    email:{
      type: 'string',
      primaryKey: true
    },
    username: {
      type: 'string',
      unique: true,
      required: true
    },
    password: {
      type: 'string'
    },
    name: {
      type: 'string'
    },
    surname: {
      type: 'string'
    },
    biography: {
      type: 'string',
      size: 240
    },
    birthday: {
      type: 'string'
    },
    country: {
      type: 'string'
    },
    rank: {
      type: 'string',
      enum: ['diamond','platinum','gold','silver','bronze','coal'],
      defaultsTo: 'coal'
    },
    profilePicture:{
      type: 'integer'
    },
    hasFacebook:{
      type:'boolean',
      defaultsTo: false
    },
    hasGoogle:{
      type: 'boolean',
      defaultsTo: false
    },
    deactivated:{
      type: 'boolean',
      defaultsTo: false
    },
    karma:{
      type: 'integer',
      defaultsTo: 0
    }
  }
};

