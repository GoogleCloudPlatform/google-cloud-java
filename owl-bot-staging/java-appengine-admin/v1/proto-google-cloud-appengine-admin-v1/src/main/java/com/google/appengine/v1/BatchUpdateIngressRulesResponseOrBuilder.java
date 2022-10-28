// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/appengine.proto

package com.google.appengine.v1;

public interface BatchUpdateIngressRulesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.BatchUpdateIngressRulesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The full list of ingress FirewallRules for this application.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
   */
  java.util.List<com.google.appengine.v1.firewall.FirewallRule> 
      getIngressRulesList();
  /**
   * <pre>
   * The full list of ingress FirewallRules for this application.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
   */
  com.google.appengine.v1.firewall.FirewallRule getIngressRules(int index);
  /**
   * <pre>
   * The full list of ingress FirewallRules for this application.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
   */
  int getIngressRulesCount();
  /**
   * <pre>
   * The full list of ingress FirewallRules for this application.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
   */
  java.util.List<? extends com.google.appengine.v1.firewall.FirewallRuleOrBuilder> 
      getIngressRulesOrBuilderList();
  /**
   * <pre>
   * The full list of ingress FirewallRules for this application.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.FirewallRule ingress_rules = 1;</code>
   */
  com.google.appengine.v1.firewall.FirewallRuleOrBuilder getIngressRulesOrBuilder(
      int index);
}
