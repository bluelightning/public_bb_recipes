SUMMARY = "Asyncronous I/O"
AUTHOR = "Paul Evans <leonerd@leonerd.org.uk>"
HOMEPAGE = "https://metacpan.org/release/IO-Async"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1110802953dcda019191a6124f13a28b"

RDEPENDS_${PN} = " \
                 perl-module-exporter \
                 perl-module-file-stat \
                 perl-module-storable \
                 perl-module-time-hires \
                 libio-poll-perl \
                 libsocket-perl \
                 libfuture-perl \
                 "

RPROVIDES_${PN} = " \
                  libio-async-perl \
                  libio-async-channel-perl \
                  libio-async-childmanager-perl \
                  libio-async-file-perl \
                  libio-async-filestream-perl \
                  libio-async-function-perl \
                  libio-async-future-perl \
                  libio-async-handle-perl \
                  libio-async-listener-perl \
                  libio-async-loop-perl \
                  libio-async-loop-poll-perl \
                  libio-async-loop-select-perl \
                  libio-async-looptests-perl \
                  libio-async-mergepoint-perl \
                  libio-async-notifier-perl \
                  libio-async-os-perl \
                  libio-async-os-mswin32-perl \
                  libio-async-os-cygwin-perl \
                  libio-async-pid-perl \
                  libio-async-process-perl \
                  libio-async-protocol-perl \
                  libio-async-protocol-linestream-perl \
                  libio-async-protocol-stream-perl \
                  libio-async-resolver-perl \
                  libio-async-routine-perl \
                  libio-async-signal-perl \
                  libio-async-socket-perl \
                  libio-async-stream-perl \
                  libio-async-test-perl \
                  libio-async-timer-perl \
                  libio-async-timer-absolute-perl \
                  libio-async-timer-countdown-perl \
                  libio-async-timer-periodic-perl \
                  "

SRC_URI = "http://cpan.metacpan.org/authors/id/P/PE/PEVANS/IO-Async-${PV}.tar.gz"
SRC_URI[md5sum] = "14cbfa50027e0121a95a0f3e259b6d74"
SRC_URI[sha256sum] = "4edfded76d6f98c8eb9fe33dbe782f2b52cde275249c3fb7bc37d5e24c48dd46"

S = "${WORKDIR}/IO-Async-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
