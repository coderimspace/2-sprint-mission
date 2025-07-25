package com.sprint.mission.discodeit.event;

import com.sprint.mission.discodeit.dto.channel.ChannelDto;
import java.util.List;
import java.util.UUID;

public record PrivateChannelCreatedEvent(ChannelDto channel, List<UUID> participantIds) {

}
