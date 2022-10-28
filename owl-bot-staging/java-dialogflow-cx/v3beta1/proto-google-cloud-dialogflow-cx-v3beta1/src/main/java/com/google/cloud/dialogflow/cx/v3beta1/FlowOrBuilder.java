// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/flow.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface FlowOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.Flow)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The unique identifier of the flow.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The unique identifier of the flow.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The human-readable name of the flow.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Required. The human-readable name of the flow.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * The description of the flow. The maximum length is 500 characters. If
   * exceeded, the request is rejected.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * The description of the flow. The maximum length is 500 characters. If
   * exceeded, the request is rejected.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * A flow's transition routes serve two purposes:
   * *   They are responsible for matching the user's first utterances in the
   * flow.
   * *   They are inherited by every page's [transition
   * routes][Page.transition_routes] and can support use cases such as the user
   * saying "help" or "can I talk to a human?", which can be handled in a common
   * way regardless of the current page. Transition routes defined in the page
   * have higher priority than those defined in the flow.
   * TransitionRoutes are evalauted in the following order:
   * *   TransitionRoutes with intent specified.
   * *   TransitionRoutes with only condition specified.
   * TransitionRoutes with intent specified are inherited by pages in the flow.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TransitionRoute transition_routes = 4;</code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.TransitionRoute> 
      getTransitionRoutesList();
  /**
   * <pre>
   * A flow's transition routes serve two purposes:
   * *   They are responsible for matching the user's first utterances in the
   * flow.
   * *   They are inherited by every page's [transition
   * routes][Page.transition_routes] and can support use cases such as the user
   * saying "help" or "can I talk to a human?", which can be handled in a common
   * way regardless of the current page. Transition routes defined in the page
   * have higher priority than those defined in the flow.
   * TransitionRoutes are evalauted in the following order:
   * *   TransitionRoutes with intent specified.
   * *   TransitionRoutes with only condition specified.
   * TransitionRoutes with intent specified are inherited by pages in the flow.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TransitionRoute transition_routes = 4;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.TransitionRoute getTransitionRoutes(int index);
  /**
   * <pre>
   * A flow's transition routes serve two purposes:
   * *   They are responsible for matching the user's first utterances in the
   * flow.
   * *   They are inherited by every page's [transition
   * routes][Page.transition_routes] and can support use cases such as the user
   * saying "help" or "can I talk to a human?", which can be handled in a common
   * way regardless of the current page. Transition routes defined in the page
   * have higher priority than those defined in the flow.
   * TransitionRoutes are evalauted in the following order:
   * *   TransitionRoutes with intent specified.
   * *   TransitionRoutes with only condition specified.
   * TransitionRoutes with intent specified are inherited by pages in the flow.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TransitionRoute transition_routes = 4;</code>
   */
  int getTransitionRoutesCount();
  /**
   * <pre>
   * A flow's transition routes serve two purposes:
   * *   They are responsible for matching the user's first utterances in the
   * flow.
   * *   They are inherited by every page's [transition
   * routes][Page.transition_routes] and can support use cases such as the user
   * saying "help" or "can I talk to a human?", which can be handled in a common
   * way regardless of the current page. Transition routes defined in the page
   * have higher priority than those defined in the flow.
   * TransitionRoutes are evalauted in the following order:
   * *   TransitionRoutes with intent specified.
   * *   TransitionRoutes with only condition specified.
   * TransitionRoutes with intent specified are inherited by pages in the flow.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TransitionRoute transition_routes = 4;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.TransitionRouteOrBuilder> 
      getTransitionRoutesOrBuilderList();
  /**
   * <pre>
   * A flow's transition routes serve two purposes:
   * *   They are responsible for matching the user's first utterances in the
   * flow.
   * *   They are inherited by every page's [transition
   * routes][Page.transition_routes] and can support use cases such as the user
   * saying "help" or "can I talk to a human?", which can be handled in a common
   * way regardless of the current page. Transition routes defined in the page
   * have higher priority than those defined in the flow.
   * TransitionRoutes are evalauted in the following order:
   * *   TransitionRoutes with intent specified.
   * *   TransitionRoutes with only condition specified.
   * TransitionRoutes with intent specified are inherited by pages in the flow.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TransitionRoute transition_routes = 4;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.TransitionRouteOrBuilder getTransitionRoutesOrBuilder(
      int index);

  /**
   * <pre>
   * A flow's event handlers serve two purposes:
   * *   They are responsible for handling events (e.g. no match,
   * webhook errors) in the flow.
   * *   They are inherited by every page's [event
   * handlers][Page.event_handlers], which can be used to handle common events
   * regardless of the current page. Event handlers defined in the page
   * have higher priority than those defined in the flow.
   * Unlike [transition_routes][google.cloud.dialogflow.cx.v3beta1.Flow.transition_routes], these handlers are
   * evaluated on a first-match basis. The first one that matches the event
   * get executed, with the rest being ignored.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.EventHandler event_handlers = 10;</code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.EventHandler> 
      getEventHandlersList();
  /**
   * <pre>
   * A flow's event handlers serve two purposes:
   * *   They are responsible for handling events (e.g. no match,
   * webhook errors) in the flow.
   * *   They are inherited by every page's [event
   * handlers][Page.event_handlers], which can be used to handle common events
   * regardless of the current page. Event handlers defined in the page
   * have higher priority than those defined in the flow.
   * Unlike [transition_routes][google.cloud.dialogflow.cx.v3beta1.Flow.transition_routes], these handlers are
   * evaluated on a first-match basis. The first one that matches the event
   * get executed, with the rest being ignored.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.EventHandler event_handlers = 10;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.EventHandler getEventHandlers(int index);
  /**
   * <pre>
   * A flow's event handlers serve two purposes:
   * *   They are responsible for handling events (e.g. no match,
   * webhook errors) in the flow.
   * *   They are inherited by every page's [event
   * handlers][Page.event_handlers], which can be used to handle common events
   * regardless of the current page. Event handlers defined in the page
   * have higher priority than those defined in the flow.
   * Unlike [transition_routes][google.cloud.dialogflow.cx.v3beta1.Flow.transition_routes], these handlers are
   * evaluated on a first-match basis. The first one that matches the event
   * get executed, with the rest being ignored.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.EventHandler event_handlers = 10;</code>
   */
  int getEventHandlersCount();
  /**
   * <pre>
   * A flow's event handlers serve two purposes:
   * *   They are responsible for handling events (e.g. no match,
   * webhook errors) in the flow.
   * *   They are inherited by every page's [event
   * handlers][Page.event_handlers], which can be used to handle common events
   * regardless of the current page. Event handlers defined in the page
   * have higher priority than those defined in the flow.
   * Unlike [transition_routes][google.cloud.dialogflow.cx.v3beta1.Flow.transition_routes], these handlers are
   * evaluated on a first-match basis. The first one that matches the event
   * get executed, with the rest being ignored.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.EventHandler event_handlers = 10;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.EventHandlerOrBuilder> 
      getEventHandlersOrBuilderList();
  /**
   * <pre>
   * A flow's event handlers serve two purposes:
   * *   They are responsible for handling events (e.g. no match,
   * webhook errors) in the flow.
   * *   They are inherited by every page's [event
   * handlers][Page.event_handlers], which can be used to handle common events
   * regardless of the current page. Event handlers defined in the page
   * have higher priority than those defined in the flow.
   * Unlike [transition_routes][google.cloud.dialogflow.cx.v3beta1.Flow.transition_routes], these handlers are
   * evaluated on a first-match basis. The first one that matches the event
   * get executed, with the rest being ignored.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.EventHandler event_handlers = 10;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.EventHandlerOrBuilder getEventHandlersOrBuilder(
      int index);

  /**
   * <pre>
   * A flow's transition route group serve two purposes:
   * *   They are responsible for matching the user's first utterances in the
   * flow.
   * *   They are inherited by every page's [transition
   * route groups][Page.transition_route_groups]. Transition route groups
   * defined in the page have higher priority than those defined in the flow.
   * Format:`projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/transitionRouteGroups/&lt;TransitionRouteGroup ID&gt;`.
   * </pre>
   *
   * <code>repeated string transition_route_groups = 15 [(.google.api.resource_reference) = { ... }</code>
   * @return A list containing the transitionRouteGroups.
   */
  java.util.List<java.lang.String>
      getTransitionRouteGroupsList();
  /**
   * <pre>
   * A flow's transition route group serve two purposes:
   * *   They are responsible for matching the user's first utterances in the
   * flow.
   * *   They are inherited by every page's [transition
   * route groups][Page.transition_route_groups]. Transition route groups
   * defined in the page have higher priority than those defined in the flow.
   * Format:`projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/transitionRouteGroups/&lt;TransitionRouteGroup ID&gt;`.
   * </pre>
   *
   * <code>repeated string transition_route_groups = 15 [(.google.api.resource_reference) = { ... }</code>
   * @return The count of transitionRouteGroups.
   */
  int getTransitionRouteGroupsCount();
  /**
   * <pre>
   * A flow's transition route group serve two purposes:
   * *   They are responsible for matching the user's first utterances in the
   * flow.
   * *   They are inherited by every page's [transition
   * route groups][Page.transition_route_groups]. Transition route groups
   * defined in the page have higher priority than those defined in the flow.
   * Format:`projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/transitionRouteGroups/&lt;TransitionRouteGroup ID&gt;`.
   * </pre>
   *
   * <code>repeated string transition_route_groups = 15 [(.google.api.resource_reference) = { ... }</code>
   * @param index The index of the element to return.
   * @return The transitionRouteGroups at the given index.
   */
  java.lang.String getTransitionRouteGroups(int index);
  /**
   * <pre>
   * A flow's transition route group serve two purposes:
   * *   They are responsible for matching the user's first utterances in the
   * flow.
   * *   They are inherited by every page's [transition
   * route groups][Page.transition_route_groups]. Transition route groups
   * defined in the page have higher priority than those defined in the flow.
   * Format:`projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/transitionRouteGroups/&lt;TransitionRouteGroup ID&gt;`.
   * </pre>
   *
   * <code>repeated string transition_route_groups = 15 [(.google.api.resource_reference) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the transitionRouteGroups at the given index.
   */
  com.google.protobuf.ByteString
      getTransitionRouteGroupsBytes(int index);

  /**
   * <pre>
   * NLU related settings of the flow.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.NluSettings nlu_settings = 11;</code>
   * @return Whether the nluSettings field is set.
   */
  boolean hasNluSettings();
  /**
   * <pre>
   * NLU related settings of the flow.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.NluSettings nlu_settings = 11;</code>
   * @return The nluSettings.
   */
  com.google.cloud.dialogflow.cx.v3beta1.NluSettings getNluSettings();
  /**
   * <pre>
   * NLU related settings of the flow.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.NluSettings nlu_settings = 11;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.NluSettingsOrBuilder getNluSettingsOrBuilder();
}
