PACKAGECONFIG:remove:rpi = " gl"

PACKAGECONFIG:append:rpi = " hls libmms \
                   ${@bb.utils.contains('LICENSE_FLAGS_ACCEPTED', 'commercial', 'gpl faad', '', d)}"
